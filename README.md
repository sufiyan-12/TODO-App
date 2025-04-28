# 📋 Todo App - Jetpack Compose, Hilt, Room

A simple and clean Todo Application built with the latest Android tech stack:

- 🖌 Jetpack Compose for UI

- 💉 Hilt for Dependency Injection

- 🛢 Room for local database persistence

- 🧠 MVVM Architecture (Model-View-ViewModel)

---

## ✨ Features
- Add new todo items
- Mark todo items as completed/incompleted
- Delete todo items
- Persistent data storage using Room database
- Modern Android development best practices
- Clean Architecture (Data, Domain, Presentation layers separated)

---

## 📸 Screenshots
| Home Screen | Add Todo | Mark as Done |
|:---:|:---:|:---:|
| ![home](./screenshots/home.png) | ![add](./screenshots/add.png) | ![done](./screenshots/done.png) |

---

## 🏗️ Tech Stack
| Tool | Usage |
|:---|:---|
| [Jetpack Compose](https://developer.android.com/jetpack/compose) | Building declarative UIs |
| [Room](https://developer.android.com/jetpack/androidx/releases/room) | Local Database |
| [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) | Dependency Injection |
| [MVVM Architecture](https://developer.android.com/jetpack/guide) | Application Architecture |
| [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines) | Asynchronous programming |

## 🧹 Clean Architecture Principles

- **Separation of concerns**: Each layer has a specific responsibility.
- **Loose coupling**: ViewModel doesn't directly depend on Room, it uses Repository interface.
- **Testability**: You can easily test ViewModels or Repository separately.

---

## 🔥 How It Works

- UI layer (Compose) interacts with `TodoViewModel`
- `TodoViewModel` calls the methods from the `TodoRepository`
- `TodoRepositoryImpl` interacts with `TodoDao`
- `TodoDao` manages CRUD operations in the Room Database

---

## ✍️ Author

- [Mohd Sufiyan](https://github.com/sufiyan-12)  
Feel free to contribute, suggest improvements, or fork the project! 🚀

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

