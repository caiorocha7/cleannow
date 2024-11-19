import type { NextPage } from "next";
import React, { useEffect, useState } from "react";
import DashboardCard from "../components/DashboardCard";
import Navbar from "../components/Navbar";

const Dashboard: NextPage = () => {
  const [data, setData] = useState([
    { title: "Customers", value: 0, iconUrl: "/images/customers.png", apiPath: "/clientes" },
    { title: "VIP Customers", value: 0, iconUrl: "/images/vip.png", apiPath: "/clientes-vip" },
    { title: "Orders", value: 0, iconUrl: "/images/orders.png", apiPath: "/pedidos" },
    { title: "Services", value: 0, iconUrl: "/images/services.png", apiPath: "/servicos" },
    { title: "Appointments", value: 0, iconUrl: "/images/appointments.png", apiPath: "/agendamentos" },
  ]);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  const API_BASE_URL = "http://localhost:8080"; // Replace with your API base URL

  const fetchData = async () => {
    setIsLoading(true);
    setError(null);

    try {
      const updatedData = await Promise.all(
        data.map(async (item) => {
          const response = await fetch(`${API_BASE_URL}${item.apiPath}`);
          if (!response.ok) throw new Error(`Failed to fetch ${item.title}`);
          const result = await response.json();
          return { ...item, value: result.length }; // Assuming API returns an array
        })
      );
      setData(updatedData);
    } catch (error) {
      console.error("Error fetching dashboard data:", error);
      setError("Failed to load dashboard data. Please try again later.");
    } finally {
      setIsLoading(false);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <div className="flex flex-row">
      <Navbar />
      <div className="min-h-screen bg-gray-100 p-4 flex-1">
        <h1 className="text-2xl font-bold mb-4 text-blue-800">Dashboard</h1>

        {/* Error Alert */}
        {error && (
          <div className="bg-red-500 text-white px-4 py-2 rounded mb-4 flex justify-between items-center">
            <span>{error}</span>
            <button
              onClick={() => setError(null)}
              className="text-white font-bold px-2 rounded hover:bg-red-700"
            >
              ×
            </button>
          </div>
        )}

        {/* Loading State */}
        {isLoading ? (
          <p>Loading...</p>
        ) : (
          <div className="grid grid-cols-1 md:grid-cols-3 lg:grid-cols-5 gap-4">
            {data.map((item) => (
              <DashboardCard
                key={item.title}
                title={item.title}
                value={item.value}
                iconUrl={item.iconUrl}
              />
            ))}
          </div>
        )}
      </div>
    </div>
  );
};

export default Dashboard;
