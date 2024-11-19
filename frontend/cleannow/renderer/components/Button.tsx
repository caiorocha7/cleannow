import React from "react";

interface ButtonProps {
  label: string;
  onClick: () => void;
}

const Button: React.FC<ButtonProps> = ({ label, onClick }) => {
  return (
    <button
      className="bg-blue-800 text-white px-4 py-2 rounded hover:bg-blue-600"
      onClick={onClick}
    >
      {label}
    </button>
  );
};

export default Button;
