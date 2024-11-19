import React from "react";

interface FormFieldProps {
  name: string;
  label: string;
  type: string;
  value: any;
  onChange: (name: string, value: any) => void;
}

const FormField: React.FC<FormFieldProps> = ({ name, label, type, value, onChange }) => {
  return (
    <div className="mb-4">
      <label htmlFor={name} className="block text-sm font-medium text-gray-700 mb-1">
        {label}
      </label>
      <input
        id={name}
        name={name}
        type={type}
        value={value}
        onChange={(e) => onChange(name, e.target.value)}
        className="block w-full text-gray-700 border-gray-300 rounded-md shadow-sm focus:ring-blue-800 focus:border-blue-500 sm:text-sm"
      />
    </div>
  );
};

export default FormField;
