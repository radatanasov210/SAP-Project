# SAP-Project
<h1>Документация: SAP-Book Store Project</h1>
<h3>1. Въведение</h3>
<h5>Екип</h5>

Рудин - Главен програмист Back end и Testing

Стоян - Главен програмист Front end

Красимир - Бизнес Модел (Lean Canvas), Архитектурна Диаграма

Радослав Тодоров - Презентация

Радослав Атанасов - Мениджър, Диаграма на Базата данни, Диаграма на Класовете, Sequence Диаграми, GitHub

Уебсайтът за продажба на книги е онлайн платформа, в която потребителите могат да разглеждат и закупуват книги от каталог с различни жанрове и автори.


<h3>3. Функционалности</h3>
2.1 Потребител

Регистрация и вход

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/accd3fba-2f5e-44db-bdf8-9a4317d2dec8" 
     width="600" 
     height="300" />
<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/63116450-c151-46d8-b9ac-3ff7fc12e1da" 
     width="600" 
     height="300" />
     
Потребителите могат да се регистрират със свой акаунт или да влязат със съществуващ.
Всеки потребител има личен профил, чрез който може да закупува книги.
Търсене в различни категории:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/e1871215-291a-4180-83dc-573971d8bc7b" 
     width="600" 
     height="300" />

Потребителят може да си избере да търси книги по заглавие или автор, както и да разглежда различните категории жанрове
Преглед на страница с детайли за книгата:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/2cda26e3-fd8e-4dba-9a2b-4cc5078607f4" 
     width="600" 
     height="300" />

Всяка книга си има отделна страница в която потребителите могат да получат информация за книгато относно автор, жанр брой страници и др.
Добавяне в количка и поръчка:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/6f67f107-5743-4888-af6d-6a323cecf3bd" 
     width="600" 
     height="300" />
<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/27b0834a-86f4-4bc0-8d56-77f74d528cb8" 
     width="600" 
     height="300" />

Потребителите могат да добавят книги към своята количка за пазаруване.
Потребителите имат възможност за преглед и редактиране на съдържанието на количката преди завършване на покупката.

2.2 Администратор
Admin menu:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/c1bddb06-06fb-4885-b6d9-b86933d7248c" 
     width="600" 
     height="300" />

Добавяне Редактиране и Изтриване на продукти:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/66cf3540-18a8-4859-a9a4-ca52240e5e01" 
     width="600" 
     height="300" />
<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/dfab9b11-9f3f-4156-bc1a-56aace6df015" 
     width="600" 
     height="300" />

Достъп до различни видове статистики:

<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/53ceed6a-4979-412d-82e0-42875a49eabc" 
     width="600" 
     height="300" />
<img src="https://github.com/radatanasov210/SAP-Project/assets/115942521/3a829a0c-4439-4301-b77f-9bf0bdc2dea7" 
     width="600" 
     height="300" />

Достъп до различни видове статистики
3. Технологии
<h5>Бизнес Модел</h5>

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/626550bb-4f84-4dd3-a8bd-dc90f4e65465)


<h5>Aрхитектурна Диаграма</h5>

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/7828b43c-f5d1-4aee-9460-bb16896cdce6)

<h5>Диаграма на Базата данни</h5>

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/35fe46c9-1fb4-4997-886d-0c933e55ffb6)

<h5>Диаграма на класовете</h5>

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/84b23e62-1c30-445c-aff1-05039fdf9191)

<h5>Sequence Диаграми</h5>
>register

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/2e3ccb1d-c466-4ada-aafd-c7397139da74)

>order

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/e85eb211-de5d-4c9f-b8fb-b112b0a18e7c)

>add to cart

![image](https://github.com/radatanasov210/SAP-Project/assets/115942521/c0add3d5-e34a-4510-98c0-e957ea8a0116)

Уебсайтът е разработен с използването на:

Frontend: HTML, CSS, JavaScript, React.js

Backend: Java, Spring Boot, MySql

Автентикация и авторизация: JSON Web Tokens (JWT) за сесии и управление на потребителите

Други инструменти: Git за управление на версиите, IntelliJ IDEA за разработка



4. Интерфейс
   
Интерфейсът на уебсайта за продажба на книги е упростен и лесен за използване.
