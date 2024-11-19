import React from "react";
import CRUDPage from "../../components/CRUDPage";

const CustomersList = () => {
  return (
    <CRUDPage
      title="Customers"
      apiBasePath="/clientes"
      fieldConfigs={[
        { name: "id", label: "ID", type: "text" },
        { name: "nome", label: "Name", type: "text" },
        { name: "contato", label: "Contact", type: "text" },
        { name: "tipoCliente", label: "Type", type: "text" },
      ]}
    />
  );
};

export default CustomersList;
