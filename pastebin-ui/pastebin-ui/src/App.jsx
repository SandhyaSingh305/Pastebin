import React from "react";
import CreatePaste from "./component/CreatePaste";
import PasteList from "./component/PasteList";

function App() {
    return (
        <div>
            <h1>Pastebin</h1>

            <CreatePaste />

            <hr />

            <PasteList />
        </div>
    );
}

export default App;