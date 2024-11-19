import React from "react";
import CRUDPage from "../../components/CRUDPage";

const AppointmentsList = () => {
  return (
    <CRUDPage
      title="Appointments"
      apiBasePath="/agendamentos"
      fieldConfigs={[
        { name: "id", label: "ID", type: "text" },
        { name: "dataColeta", label: "Collection Date", type: "date" },
        { name: "dataEntrega", label: "Delivery Date", type: "date" },
      ]}
    />
  );
};

export default AppointmentsList;
