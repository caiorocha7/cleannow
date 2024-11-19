import React, { useState, useEffect } from "react";
import Navbar from "./Navbar";
import Table from "./Table";
import Button from "./Button";
import Modal from "./Modal";
import ErrorAlert from "./ErrorAlert";

const CRUDPage = ({ title, apiBasePath, fieldConfigs }) => {
  const [items, setItems] = useState([]);
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [modalData, setModalData] = useState(null);
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState(null);

  const API_BASE_URL = "http://localhost:8080";

  // Fetch items from the API
  const fetchItems = async () => {
    setIsLoading(true);
    setError(null);
    try {
      const response = await fetch(`${API_BASE_URL}${apiBasePath}`);
      if (!response.ok) throw new Error("Failed to fetch data");
      const data = await response.json();
      setItems(data);
    } catch (error) {
      setError(`Failed to load ${title.toLowerCase()} data. Please try again.`);
    } finally {
      setIsLoading(false);
    }
  };

  // Save an item (Add or Update)
  const saveItem = async (item) => {
    const method = item.id ? "PUT" : "POST";
    const url = item.id
      ? `${API_BASE_URL}${apiBasePath}/${item.id}`
      : `${API_BASE_URL}${apiBasePath}`;

    try {
      const response = await fetch(url, {
        method,
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(item),
      });

      if (!response.ok) throw new Error("Failed to save item");
      fetchItems();
    } catch (error) {
      setError(`Failed to save ${title.toLowerCase()}. Please try again.`);
    }
  };

  // Delete an item
  const deleteItem = async (item) => {
    try {
      const response = await fetch(`${API_BASE_URL}${apiBasePath}/${item.id}`, {
        method: "DELETE",
      });

      if (!response.ok) throw new Error("Failed to delete item");
      fetchItems();
    } catch (error) {
      setError(`Failed to delete ${title.toLowerCase()}. Please try again.`);
    }
  };

  useEffect(() => {
    fetchItems();
  }, []);

  const handleAddItem = () => {
    setModalData(null); // Clear modal data for new item
    setIsModalOpen(true);
  };

  const handleEditItem = (row) => {
    // Map row data to modal fields based on fieldConfigs
    const rowData = fieldConfigs.reduce((acc, field, index) => {
      acc[field.name] = row[index];
      return acc;
    }, {});
    setModalData(rowData);
    setIsModalOpen(true);
  };

  const handleSaveItem = (item) => {
    saveItem(item);
    setIsModalOpen(false);
  };

  const handleDeleteItem = (row) => {
    const rowData = fieldConfigs.reduce((acc, field, index) => {
      acc[field.name] = row[index];
      return acc;
    }, {});
    deleteItem(rowData);
  };

  return (
    <div className="flex flex-row">
      <Navbar />
      <div className="min-h-screen bg-gray-100 p-4 flex-1">
        <h1 className="text-2xl font-bold mb-4 text-blue-800">{title}</h1>
        <div className="flex justify-between items-center mb-4">
          <h2 className="text-lg font-semibold text-gray-700">
            Total of {title.toLowerCase()}: {items.length}
          </h2>
          <Button onClick={handleAddItem} label="+" />
        </div>

        {error && <ErrorAlert message={error} onClose={() => setError(null)} />}

        {isLoading ? (
          <p>Loading...</p>
        ) : (
          <Table
            headers={fieldConfigs.map((field) => field.label)}
            rows={items.map((item) =>
              fieldConfigs.map((field) => item[field.name])
            )}
            actions={true}
            onEdit={handleEditItem}
            onDelete={handleDeleteItem}
          />
        )}
      </div>

      {/* Modal for Add/Edit */}
      <Modal
        isOpen={isModalOpen}
        onClose={() => setIsModalOpen(false)}
        onSubmit={handleSaveItem}
        title={modalData ? `Edit ${title}` : `Add ${title}`}
        fields={fieldConfigs.map((field) => ({
            ...field,
            value: modalData?.[field.name] || "",
            hidden: field.name === "id", // Hide the ID field
        }))}
        />
    </div>
  );
};

export default CRUDPage;
