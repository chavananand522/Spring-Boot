import { useState } from "react";
import axios from "axios";

function GetUser() {

    const [result, setResult] = useState("");

    const getData = () => {
        axios
            .get("http://localhost:8080/user/get/28")
            .then((res) => {
                setResult(JSON.stringify(res.data));
            })
            .catch((err) => {
                setResult("Wrong URL");
            });
    };

    return (
        <div>
            <h1>Hello from GetUser</h1>
            <button onClick={getData}>Get User</button>
            <h2>{result}</h2>
        </div>
    );
}

export default GetUser;