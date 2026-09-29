import { useEffect, useState } from "react";
import axios from "axios";
import "./Comps/GetUserAll.css";

function GetUserByPage() {
  const [users, setUsers] = useState([]);
  const [pageNum, setPageNum] = useState(0);

  useEffect(() => {
    axios
      .get(`http://localhost:8080/user/getpages/${pageNum}/6`)
      .then((res) => {
        setUsers(res.data.content);
      })
      .catch((err) => {
        console.log(err);
      });
  }, [pageNum]);

  const previous = () => setPageNum((prev) => Math.max(prev - 1, 0));
  const next = () => setPageNum((prev) => prev + 1);
  const page = (pn) => setPageNum(pn);

  return (
    <div className="inn">
      <h1>Hello from Pagination</h1>

      {users.length > 0 ? (
        <div className="container">
          {users.map((user) => (
            <div className="book" key={user.id}>
              <img
                src="https://images.squarespace-cdn.com/content/v1/66a4f1fc404ca05cac7d8ec8/a638aa06-2282-43ba-a485-333159005cae/LinkedIn+Headshot+Male.jpg"
                alt="User"
                width="150"
              />
              <h3>{user.name}</h3>
              <h4>{user.password}</h4>
              <h4>{user.salary}</h4>
            </div>
          ))}
        </div>
      ) : (
        <h3>No Users Found</h3>
      )}

      <button className="btn1" onClick={previous}>Previous</button>
      <button className="btn3" onClick={() => page(0)}>1</button>
      <button className="btn3" onClick={() => page(1)}>2</button>
      <button className="btn3" onClick={() => page(2)}>3</button>
      <button className="btn3" onClick={() => page(3)}>4</button>
      <button className="btn3" onClick={() => page(4)}>5</button>
      <button className="btn2" onClick={next}>Next</button>
    </div>
  );
}

export default GetUserByPage;