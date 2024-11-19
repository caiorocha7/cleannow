import React from "react";
import Image from "next/image";

interface DashboardCardProps {
  title: string;
  value: number;
iconUrl: string;
}

const DashboardCard: React.FC<DashboardCardProps> = ({ title, value, iconUrl }) => {
    return (
        <div className="bg-blue-800 shadow-md rounded-lg p-4 flex flex-col items-center">
            <div className="flex items-center flex-row space-x-1">
                <Image src={iconUrl} alt={title} width={30} height={30} />
                <h3 className="text-lg font-semibold">{title}</h3>
            </div>
            <p className="text-2xl font-bold mt-2">{value}</p>
        </div>
    );
};

export default DashboardCard;
