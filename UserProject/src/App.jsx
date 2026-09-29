import { BrowserRouter, Routes, Route } from "react-router-dom";
import SignIn from "./SignIn";
import Home from "./Comps/Home";
import Navbar from "./Comps/Navbar";
import GetUserByPage from "./GetUserByPage";
import SignUp from "./SignUp";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<SignIn />} />
          <Route path="/signin" element={<SignIn />} />
          <Route path="/home" element={<Home />} />
          <Route path="/pages" element={<GetUserByPage />} />
          <Route path="/signup" element={<SignUp />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;