import React from "react";
import CRUDPage from "../../components/CRUDPage";

const ServicesList = () => {
  return (
    <CRUDPage
      title="Services"
      apiBasePath="/servicos"
      fieldConfigs={[
        { name: "id", label: "ID", type: "text" },
        { name: "tipoServico", label: "Service Type", type: "text" },
        { name: "preco", label: "Price", type: "number" },
      ]}
    />
  );
};

export default ServicesList;
