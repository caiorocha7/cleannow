import React from "react";

interface TableRowProps {
  row: (string | number)[];
  actions?: boolean;
  onEdit?: () => void;
  onDelete?: () => void;
}

const TableRow: React.FC<TableRowProps> = ({ row, actions, onEdit, onDelete }) => {
  return (
    <tr className="border-b hover:bg-gray-100">
      {row.map((cell, index) => (
        <td key={index} className="px-4 py-2 text-gray-700">
          {cell}
        </td>
      ))}
      {actions && (
        <td className="px-4 py-2">
          <button className="text-blue-800 hover:underline mr-2" onClick={onEdit}>Edit</button>
          <button className="text-red-600 hover:underline" onClick={onDelete}>Delete</button>
        </td>
      )}
    </tr>
  );
};

export default TableRow;
