CREATE DATABASE library_management_db;
USE library_management_db;

-- Login Page sathi users table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Books Table (Add Book / View Books)[cite: 2, 3]
CREATE TABLE books (
    book_id VARCHAR(50) PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    published_year INT,
    quantity INT NOT NULL
);

-- Members Table (Add Member / View Members)[cite: 3]
CREATE TABLE members (
    member_id VARCHAR(50) PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone_number VARCHAR(20),
    address TEXT
);

-- Borrow Records Table (Issue Book, Return Book, Borrowing History)[cite: 3, 4]
CREATE TABLE borrow_records (
    borrow_id INT AUTO_INCREMENT PRIMARY KEY,
    member_id VARCHAR(50),
    book_id VARCHAR(50),
    issue_date DATE NOT NULL,
    due_date DATE NOT NULL,
    return_date DATE,
    status VARCHAR(20) DEFAULT 'Borrowed',
    FOREIGN KEY (member_id) REFERENCES members(member_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

-- Login user add karne
INSERT INTO users (username, password) VALUES ('admin', 'admin123');

-- Books add karne
INSERT INTO books (book_id, title, author, category, published_year, quantity) VALUES
('B001', 'JavaFX Programming', 'John Smith', 'Programming', 2022, 5),
('B002', 'Database Management', 'Alice Johnson', 'Computer Science', 2021, 3),
('B003', 'Data Structures', 'Robert Fox', 'Computer Science', 2023, 4);

-- Members add karne
INSERT INTO members (member_id, full_name, email, phone_number, address) VALUES
('M001', 'Kamal Perera', 'kamal@gmail.com', '0712345678', 'Colombo'),
('M002', 'Nimal Silva', 'nimal@gmail.com', '0771234567', 'Kandy');

-- Borrow Records add karne (Issue books)[cite: 3, 4]
INSERT INTO borrow_records (member_id, book_id, issue_date, due_date, status) VALUES
('M001', 'B001', '2026-10-01', '2026-10-15', 'Borrowed');