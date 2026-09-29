import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function SignIn() {
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [result, setResult] = useState("Result");

  const navigate = useNavigate();

  const login = () => {
    axios
      .get(`http://localhost:8080/user/signin/${userName}/${password}`)
      .then((res) => {
        if (res.data === "success") {
          setResult("Login Successful");
          navigate("/home"); // Navigate after successful login
        } else {
          setResult("Invalid Credentials");
        }
      })
      .catch((err) => {
        console.error(err);
        setResult("Wrong URL or Server Error");
      });
  };

  return (
    <div>
      <h1>Hello from Sign In</h1>

      <label>User Name:</label>
      <br />
      <input
        type="text"
        value={userName}
        onChange={(e) => setUserName(e.target.value)}
        placeholder="Enter username"
      />

      <br />
      <br />

      <label>Password:</label>
      <br />
      <input
        type="password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
        placeholder="Enter password"
      />

      <br />
      <br />

      <button onClick={login}>Login</button>

      <h2>{result}</h2>
    </div>
  );
}

export default SignIn;