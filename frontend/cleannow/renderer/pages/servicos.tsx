import React, { useEffect, useState } from 'react';

interface Servico {
  id: number;
  tipoServico: string;
  preco: number;
}

export default function ServicosPage() {
  const [servicos, setServicos] = useState<Servico[]>([]);

  useEffect(() => {
    fetch('/api/servicos')
      .then((res) => res.json())
      .then((data) => setServicos(data));
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-3xl font-bold">Serviços</h1>
      <ul>
        {servicos.map((servico) => (
          <li key={servico.id} className="mt-2">
            <div className="flex justify-between">
              <span>{servico.tipoServico}</span>
              <span>${servico.preco}</span>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}
