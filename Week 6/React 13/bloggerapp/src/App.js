import "./App.css";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  return (
    <div className="App">
      <div className="container">
        <div className="section">
          <CourseDetails />
        </div>

        <div className="section">
          <BookDetails />
        </div>

        <div className="section last">
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;