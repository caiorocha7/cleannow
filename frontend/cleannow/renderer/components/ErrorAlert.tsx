import React from "react";

interface ErrorAlertProps {
  message: string;
  onClose: () => void;
}

const ErrorAlert: React.FC<ErrorAlertProps> = ({ message, onClose }) => {
  return (
    <div className="bg-red-500 text-white px-4 py-2 rounded mb-4 flex justify-between items-center">
      <span>{message}</span>
      <button
        onClick={onClose}
        className="text-white font-bold px-2 rounded hover:bg-red-700"
      >
        ×
      </button>
    </div>
  );
};

export default ErrorAlert;
