import React, { useState } from "react";
import { createPaste } from "../services/api";

function CreatePaste() {

    const [paste, setPaste] = useState({
        title: "",
        content: "",
        format: "text",
        accessMode: "public",
        expiryTime: "30-05-2027"
    });

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            await createPaste(paste);
            alert("Paste created successfully");
        } catch (err) {
            console.error(err);
        }
    };

    return (
        <div className="container">
            <h2>Create Paste</h2>

            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Title"
                    value={paste.title}
                    onChange={(e) =>
                        setPaste({
                            ...paste,
                            title: e.target.value
                        })
                    }
                />

                <textarea
                    rows="15"
                    placeholder="Paste content"
                    value={paste.content}
                    onChange={(e) =>
                        setPaste({
                            ...paste,
                            content: e.target.value
                        })
                    }
                />

                <button type="submit">
                    Create Paste
                </button>
            </form>
        </div>
    );
}

export default CreatePaste;