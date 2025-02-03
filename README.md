# Ice Cream Order Application

This repository contains a **JavaFX application** for creating and processing custom ice cream orders. The project is designed to practice GUI programming with JavaFX and adheres to a set of functional and code quality requirements.

---

## Features

### Functional Requirements
- **Ice Cream Size Selection**: 
  - Choose from Kids ($3.50), Single ($5.50), Double ($7.50), or Triple ($9.50).
  - Single size is selected by default.
- **Flavor Selection**:
  - At least 5 flavors available.
  - Number of flavors depends on the size:
    - Kids/Single: 1 flavor (default: first).
    - Double: 2 flavors (default: first two).
    - Triple: 3 flavors (default: first three).
  - Users can select repeated flavors (e.g., all Vanilla for Triple).
- **Extras**:
  - Waffle cone/bowl ($1.50).
  - Toppings (chocolate, candy, fruit, nuts – $0.50 each).
  - No extras are selected by default.
- **Order Management**:
  - **Add to Order**: Adds current ice cream selection to a list view with details and price.
  - **Checkout**: Displays order subtotal, 5% tax, and total.
  - **New Order**: Resets the form for a new order.
  - **Exit**: Closes the application.

### Code Requirements
- GUI design is **clear, attractive**, and uses appropriate containers and controls.
- Includes **colors and at least one image** to enhance the interface.
- Uses **constants** for values instead of hardcoding.
- Comments:
  - Top block comment explaining the application's purpose, creation date, and author name.
  - Reasonable inline comments for clarity.

---

## Marking Rubric

| **Marking Component**                              | **Points** |
|----------------------------------------------------|------------|
| GUI is attractive, clear, well-structured, and uses appropriate containers and controls | **4**        |
| User can make selections for ice cream as required | **4**        |
| Ice cream price is correctly calculated based on the selection | **4**        |
| Order subtotal, tax (5%), and total are calculated and displayed correctly | **4**        |
| Code is clear, uses good naming practices, and has required comments | **4**        |
| **Total**                                          | **20**       |

---
