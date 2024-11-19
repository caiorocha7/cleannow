import React from "react";
import FormField from "./FormField";

interface ModalProps {
  isOpen: boolean;
  onClose: () => void;
  onSubmit: (formData: Record<string, any>) => void;
  title: string;
  fields: { name: string; label: string; type: string; value?: any; hidden?: boolean }[];
}

const Modal: React.FC<ModalProps> = ({ isOpen, onClose, onSubmit, title, fields }) => {
  const [formData, setFormData] = React.useState<Record<string, any>>(
    fields.reduce((acc, field) => ({ ...acc, [field.name]: field.value || "" }), {})
  );

  React.useEffect(() => {
    // Update formData if fields change (e.g., for edit)
    setFormData(
      fields.reduce((acc, field) => ({ ...acc, [field.name]: field.value || "" }), {})
    );
  }, [fields]);

  const handleChange = (name: string, value: any) => {
    setFormData((prev) => ({ ...prev, [name]: value }));
  };

  const handleSubmit = () => {
    onSubmit(formData); // Submit JSON with field names as keys
    onClose();
  };

  if (!isOpen) return null;

  return (
    <div className="fixed inset-0 z-50 bg-black bg-opacity-50 flex justify-center items-center">
      <div className="bg-white rounded-lg shadow-md w-96 p-6">
        <h2 className="text-lg font-bold mb-4 text-blue-800">{title}</h2>
        <form>
          {fields
            .filter((field) => !field.hidden) // Only render visible fields
            .map((field) => (
              <FormField
                key={field.name}
                name={field.name}
                label={field.label}
                type={field.type}
                value={formData[field.name]}
                onChange={handleChange}
              />
            ))}
        </form>
        <div className="mt-4 flex justify-end space-x-4">
          <button
            type="button"
            className="bg-gray-500 text-white px-4 py-2 rounded hover:bg-gray-600"
            onClick={onClose}
          >
            Cancel
          </button>
          <button
            type="button"
            className="bg-blue-800 text-white px-4 py-2 rounded hover:bg-blue-600"
            onClick={handleSubmit}
          >
            Save
          </button>
        </div>
      </div>
    </div>
  );
};

export default Modal;
