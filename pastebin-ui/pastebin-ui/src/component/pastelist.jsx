import React, { useEffect, useState } from "react";
import { getAllPastes } from "../services/api";

function PasteList() {

    const [pastes, setPastes] = useState([]);

    useEffect(() => {
        loadPastes();
    }, []);

    const loadPastes = async () => {
        const response = await getAllPastes();
        setPastes(response.data);
    };

    return (
        <div>
            <h2>Recent Pastes</h2>

            {pastes.map((paste) => (
                <div
                    key={paste.id}
                    className="paste-card"
                >
                    <h3>{paste.title}</h3>
                    <p>{paste.format}</p>
                </div>
            ))}
        </div>
    );
}

export default PasteList;