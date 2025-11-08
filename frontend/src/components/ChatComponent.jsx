import React, { useState } from "react";
import "./ChatComponent.css"; // External CSS import

const ChatComponent = () => {
  const [question, setQuestion] = useState("");
  const [messages, setMessages] = useState([]);
  const [loading, setLoading] = useState(false);

  const handleSend = async (e) => {
    e.preventDefault();
    if (!question.trim()) return;

    const newMessage = { question, answer: "..." };
    setMessages((prev) => [...prev, newMessage]);
    setLoading(true);

    try {
      const response = await fetch("http://localhost:8080/api/openai", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ question }),
      });

      const data = await response.json();
      const updatedMessage = { question, answer: data.answer };

      setMessages((prev) => [...prev.slice(0, -1), updatedMessage]);
    } catch (error) {
      const errorMessage = {
        question,
        answer: "Error: Could not reach server",
      };
      setMessages((prev) => [...prev.slice(0, -1), errorMessage]);
    }

    setQuestion("");
    setLoading(false);
  };

  return (
    <div className="chat-container">
      <h2 className="chat-heading">AI Chat</h2>
      <div className="chat-box">
        {messages.map((msg, index) => (
          <div key={index} className="chat-message">
            <div className="chat-user">
              <b>You:</b> {msg.question}
            </div>
            <div className="chat-ai">
              <b>AI:</b> {msg.answer}
            </div>
          </div>
        ))}
        {loading && <p className="loading-text">Thinking...</p>}
      </div>

      <form onSubmit={handleSend} className="chat-form">
        <input
          type="text"
          value={question}
          onChange={(e) => setQuestion(e.target.value)}
          placeholder="Ask something..."
          className="chat-input"
        />
        <button type="submit" className="chat-button" disabled={loading}>
          Send
        </button>
      </form>
    </div>
  );
};

export default ChatComponent;
