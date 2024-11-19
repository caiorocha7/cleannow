import React from "react";
import CRUDPage from "../../components/CRUDPage";

const OrdersList = () => {
  return (
    <CRUDPage
      title="Orders"
      apiBasePath="/pedidos"
      fieldConfigs={[
        { name: "id", label: "ID", type: "text" },
        { name: "servico", label: "Service", type: "text" },
        { name: "status", label: "Status", type: "text" },
        { name: "dataCriacao", label: "Created Date", type: "date" },
        { name: "cliente", label: "Customer", type: "text" },
      ]}
    />
  );
};

export default OrdersList;
