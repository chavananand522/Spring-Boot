import axios from "axios";
import { useState } from "react";
import "./SignUp.css";
function SignUp() {

  var [user, setUser] = useState({
    uid: "",
    name: "",
    password: "",
    salary: ""
  });

  var forUId = (e) => {
    setUser({ ...user, uid: e.target.value });
  }

  var forName = (e) => {
    setUser({ ...user, name: e.target.value });
  }

  var forPassword = (e) => {
    setUser({ ...user, password: e.target.value });
  }

  var forSalary = (e) => {
    setUser({ ...user, salary: e.target.value });
  }

  var [result, setResult] = useState("Res");
  var add = () => {
    axios.post("http://localhost:8080/user/add", user)
      .then(() => { setResult("Sign Up Successfull") })
      .catch(() => setResult("Something went Wrong"))
  }

  return (
    <div className="box">
      <h2>Hello from Sign Up</h2>

      <label htmlFor="uid">Please Enter the ID:</label><br />
      <input type="text" name="uid" onChange={forUId} /><br /><br />

      <label htmlFor="name">Please Enter the Name:</label><br />
      <input type="text" name="name" onChange={forName} /><br /><br />

      <label htmlFor="password">Please Enter the Password:</label><br />
      <input type="password" name="password" onChange={forPassword} /><br /><br />

      <label htmlFor="salary">Please Enter the Salary:</label><br />
      <input type="salary" name="salary" onChange={forSalary} /><br /><br />

       <button onClick={add}>Sign Up</button>


     <h1>{user.uid}</h1>
     <h1>{user.name}</h1>
     <h1>{user.password}</h1>
     <h1>{user.salary}</h1>
    <h2>{result}</h2>
    </div>
  );
}

export default SignUp;