import axios from "axios";

const API_URL = "http://localhost:8080/api/v1";

export const createPaste = (paste) => {
    return axios.post(`${API_URL}/pastebin/paste`, paste, {
        auth: {
            username: "spring",
            password: "spring"
        }
    });
};

export const getAllPastes = () => {
    return axios.get(`${API_URL}/pastebin/paste`);
};

export const getPasteById = (id) => {
    return axios.get(`${API_URL}/pastebin/paste/${id}`);
};