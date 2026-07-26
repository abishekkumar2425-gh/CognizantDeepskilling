function CourseDetails() {
  const courses = [
    {
      id: 1,
      name: "Angular",
      date: "4/5/2024"
    },
    {
      id: 2,
      name: "React",
      date: "6/3/2024"
    }
  ];

  return (
    <div>
      <h1>Course Details</h1>

      {courses.map((course) => (
        <div key={course.id}>
          <h2>{course.name}</h2>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;