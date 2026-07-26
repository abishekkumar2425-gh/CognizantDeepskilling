import React from "react";

class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }
}

class Posts extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then(response => response.json())
      .then(data => {
        this.setState({
          posts: data
        });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h1>{post.title}</h1>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
  componentDidCatch(error, info) {
  alert("An error occurred");
}
}

export default Posts;