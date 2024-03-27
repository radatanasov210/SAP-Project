# SAP-Project

// UI
Swing Framework

Flatlaf Framework
url: https://github.com/JFormDesigner/FlatLaf

Ready to use UI
url: https://github.com/DJ-Raven/flatlaf-dashboard-pro


// Java Client
Приложението е разделено на 2 части. Едната част е направена за администратора, а другата за потребителя. Менютата са разделени едно от друго и потребител не може да достъпи до менюто за администратори, но администратора може.

- Login, Register
- Следене на наличности на продукти
- Разглеждане на всички налични продукти
	* Налични и неналични продукти
	* Промоционални продукти, разпродажба
- Възможност за закупуване на продукт. След закупуване quantity--;
(Admin)
- Създаване на акаунти на служители
- Добавяне, редактиране и изтриване на продукти
- Контролиране на актуална и минимална цена на продукт;
- Справка за оборота на магазина за определен период от време
- Стартиране и спиране на кампания. Admin избира кои продукти могат да бъдат на разпродажба и намаление. Продуктите също си имат минимална цена.

// Java Server
Сървърът прави комуникация с базата данни. От сървъра ще се получава информация за продуктите към главното приложение. Сървърът ще получава от клиентската програма данните, които тряба да бъдат обновени в Базата данни, 
	напр. Админ добавя нов продукт, Админ започва разпродажба тн...
Сървърът трябва да е многонишков.

// DataBase
MySQL

// WebApp

// Идеи
- Спрямо това колко време един продукт не е купуван, да се пуска на разпродажба.
- Profit Margin.
- Hot Product
- Ограничения за Admin
