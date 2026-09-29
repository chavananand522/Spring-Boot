import "./Navbar.css";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <div className="n">
      <b>NAVBAR</b>
      <Link to="/signin" className="l">Sign In</Link>
      <Link to="/pages" className="l">Get User By Pages</Link>
      <Link to="/signup" className="l">Sign Up</Link>
    </div>
  );
}

export default Navbar;