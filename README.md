🧠 SpringBoot-AI-Assistant
An intelligent AI chat application built with Spring Boot and React.js, integrating the OpenAI API to deliver smart, real-time conversational experiences.
This project demonstrates full-stack development, RESTful API design, and modern UI integration — a seamless blend of backend power and frontend interactivity.

📖 Overview
SpringBoot-AI-Assistant allows users to interact with an AI model through a clean and futuristic interface.
The backend, built in Spring Boot, processes user queries and communicates with the OpenAI API to generate intelligent responses.
The React.js frontend provides a smooth, chat-like experience — inspired by the JARVIS aesthetic for an engaging and modern look.

⚙️ Features
✅ Real-time communication between frontend and backend
✅ Spring Boot REST API for AI query handling
✅ Interactive React interface with dynamic message display
✅ Clean and responsive UI inspired by futuristic design
✅ Modular codebase for easy expansion and maintenance
✅ Integration with Spring AI / OpenAI API for intelligent replies

🧩 Tech Stack
Frontend: React.js, JavaScript, HTML, CSS
Backend: Spring Boot (Java 17), Maven
AI Integration: Spring AI / OpenAI API

📂 Project Structure
SpringBoot-AI-Assistant/
│
├── src/                      # Spring Boot backend
│   ├── main/java/com/SpringBootAI/
│   │   ├── controller/       # REST API endpoints
│   │   ├── model/            # Question & Answer models
│   │   └── service/          # OpenAI service logic
│   └── main/resources/
│       ├── application.properties
│       └── static/ (optional)
│
├── frontend/                 # React frontend
│   ├── src/
│   │   ├── App.js
│   │   └── components/
│   │       ├── ChatComponent.jsx
│   │       └── ChatComponent.css
│   ├── public/
│   ├── package.json
│   └── README.md (optional)
│
├── pom.xml                   # Maven configuration
├── .gitignore
└── README.md                 # Project documentation


🧰 Installation & Setup
🔹 Prerequisites
Java 17+
Node.js & npm
Maven

🔹 Clone the repository
git clone https://github.com/ManojAcharya08/SpringBoot-AI-Assistant.git
cd SpringBoot-AI-Assistant

🔹 Backend setup (Spring Boot)
mvn clean install
mvn spring-boot:run

Backend will start on:
👉 http://localhost:8080

🔹 Frontend setup (React)
cd frontend
npm install
npm start

Frontend will run on:
👉 http://localhost:3000

⚡ How It Works


User types a question in the chat window.
The React app sends the question as a POST request to the backend (/api/openai).
The Spring Boot backend sends the query to OpenAI using Spring AI / RestTemplate.
The AI’s response is sent back to the frontend.
The UI dynamically updates to display both user input and AI response.

🧭 Future Enhancements
Add Login & User Authentication (JWT)
Store chat history in database (MySQL / MongoDB)
Add voice interaction support (Speech-to-Text & Text-to-Speech)
Deploy on Render / Netlify / AWS
Add multiple AI model support (GPT-4, Claude, etc.)

👨‍💻 Author
Manoj Acharya
🎓 MSc Computer Science | Aspiring Software Engineer
💡 Passionate about AI, Cloud Computing, and Full-Stack Development
📧 manojacharya375@gmail.com

📜 License
This project is released under the MIT License — you’re free to use, modify, and distribute it with attribution.

⭐ If you found this project useful, please give it a star on GitHub!

“Code. Learn. Evolve. — Turning ideas into intelligent systems.”
