import React, { useEffect, useState } from 'react';

interface PlanoAssinatura {
  id: number;
  nomePlano: string;
  valorMensal: number;
}

export default function PlanosAssinaturaPage() {
  const [planos, setPlanos] = useState<PlanoAssinatura[]>([]);

  useEffect(() => {
    fetch('/api/planos-assinatura')
      .then((res) => res.json())
      .then((data) => setPlanos(data));
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-3xl font-bold">Planos de Assinatura</h1>
      <ul>
        {planos.map((plano) => (
          <li key={plano.id} className="mt-2">
            <div className="flex justify-between">
              <span>{plano.nomePlano}</span>
              <span>${plano.valorMensal}</span>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}
