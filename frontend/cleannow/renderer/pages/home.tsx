import React from 'react';
import Head from 'next/head';
import Link from 'next/link';
import Image from 'next/image';

export default function HomePage() {
  return (
    <React.Fragment>
      <Head>
        <title>CleanNow Dry Cleaner</title>
      </Head>
      <div className="flex flex-col items-center mt-10">
        <Image src="/images/logo.png" alt="CleanNow Logo" width={120} height={120} />
        <h1 className="text-4xl font-bold mt-4">CleanNow</h1>
        <p className="mt-2 text-lg">
          Gerencie sua lavanderia
          <span className='font-bold'> suja </span>
          com facilidade
        </p>
        <div className="grid grid-cols-2 gap-4 mt-8">
          {[
            { name: 'Serviços', route: '/servicos' },
            { name: 'Agendamentos', route: '/agendamentos' },
            { name: 'Planos de Assinatura', route: '/planos-assinatura' },
            { name: 'Pedidos', route: '/pedidos' },
            { name: 'Clientes VIP', route: '/clientes-vip' },
            { name: 'Clientes', route: '/clientes' },
          ].map((link) => (
            <Link href={link.route} key={link.name} className='btn-blue text-center'>
              {link.name}
            </Link>
          ))}
        </div>
      </div>
    </React.Fragment>
  );
}
