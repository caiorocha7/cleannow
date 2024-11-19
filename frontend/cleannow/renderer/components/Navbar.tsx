import Link from "next/link";
import Image from "next/image";
import React from "react";

const Navbar: React.FC = () => {

    const pages_data = [
        { name: "Customers", url: "/customers", icon: "customers" },
        { name: "VIP Customers", url: "/customers/vip", icon: "vip" },
        { name: "Services", url: "/services", icon: "services" },
        { name: "Orders", url: "/orders", icon: "orders" },
        { name: "Appointments", url: "/appointments", icon: "appointments" },
    ];

    return (
        <nav className="bg-blue-800 text-white px-4 py-3 shadow-md">
            <div className="mx-auto flex justify-between items-center flex-col space-y-40">
                <div className="mx-auto flex justify-between items-center flex-col space-y-8">
                    <div className="text-lg font-semibold">
                        <Link href="/home">
                            <Image src="/images/logo.png" alt="CleanNow" width={100} height={100}/>
                        </Link>
                    </div>
                    <div className="flex flex-col space-y-4">
                        {
                            pages_data.map((page, index) => (
                                <Link key={index} href={page.url} className="flex items-center flex-row">
                                    <Image className="mx-1" src={`/images/${page.icon}.png`} alt={page.name} width={20} height={20}/>
                                    {page.name}
                                </Link>
                            ))
                        }
                    </div>
                </div>
                <div className="text-sm text-gray-300 flex flex-col items-left">
                    <p>Made by:</p>
                    <a href="https://github.com/gabrielfmcoelho" target="_blank" rel="noreferrer">
                        Gabriel Coelho
                    </a>
                    <a href="https://github.com/caiorocha6" target="_blank" rel="noreferrer">
                        Caio Rocha
                    </a>
                </div>
            </div>
        </nav>
    );
};

export default Navbar;
