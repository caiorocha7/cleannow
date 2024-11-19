import React from "react";
import CRUDPage from "../../../components/CRUDPage";

const VIPCustomersList = () => {
  return (
    <CRUDPage
      title="VIP Customers"
      apiBasePath="/clientes-vip"
      fieldConfigs={[
        { name: "id", label: "ID", type: "text" },
        { name: "nome", label: "Name", type: "text" },
        { name: "contato", label: "Contact", type: "text" },
        { name: "planoAssinatura", label: "Plan", type: "text" },
        { name: "desconto", label: "Discount", type: "number" },
      ]}
    />
  );
};

export default VIPCustomersList;
