import React from "react";
import TableRow from "./TableRow";

interface TableProps {
  headers: string[];
  rows: (string | number)[][];
  actions?: boolean; // If actions like Edit/Delete are required
  onEdit?: (row: any) => void; // Callback for Edit
  onDelete?: (row: any) => void; // Callback for Delete
}

const Table: React.FC<TableProps> = ({ headers, rows, actions, onEdit, onDelete }) => {
  return (
    <div className="overflow-x-auto">
      <table className="min-w-full bg-white shadow-md rounded-lg">
        <thead className="bg-blue-800">
          <tr>
            {headers.map((header, index) => (
              <th key={index} className="text-left px-4 py-2">
                {header}
              </th>
            ))}
            {actions && <th className="text-left px-4 py-2">Actions</th>}
          </tr>
        </thead>
        <tbody>
          {rows.map((row, rowIndex) => (
            <TableRow key={rowIndex} row={row} actions={actions} onEdit={() => onEdit?.(row)} onDelete={() => onDelete?.(row)} />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Table;
