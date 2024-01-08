# Lab9
## Функціональність програми
Реалізувати програму для збереження даних обраного API в форматі Excel.
### Етапи
- Вибравши і використовуючи зазначене API https://fakeapi.platzi.com/en/rest/products/ отримати дані зі всіх ендпоїнтів.
- Зберегти отримані дані у форматі Excel.
- Покрити код jUnit/Mockito тестами.
## Опис роботи
- Створено клас Category з такими полям: id, name, image.
- Створено клас User з такими полями: id, email, password, name, role, avatar.
- Створено клас Product з такими полям: id, title, price, description, image, category.
- Створено клас StoreFakeAPI який відправляє GET такі запити до API: getCategories, getUsers, getProducts.
- Створено клас StoreFakeJSONMapper який використовується для парсингу JSON файлів. Цей клас має методи mapCategories, mapProducts, і mapUsers і вони використовують метод fromJson бібліотеки Gson для відображення JSON-рядка у відповідний тип об'єкта. Цей клас використовує бібліотеку Gson для парсингу JSON.
- Імпортував і використував бібліотеку Apache POI щоб створити класи ExcelFileFormatter і ExcelSheetFormatter для створення Excel таблиць.
- Клас ExcelFileFormatter був створений для легкого створення та збереження Excel файлів.
- Клас ExcelSheetFormatter був створений для створення однотипних Excel сторінок з узагальнених класів.
- Створено ExcelDemo для створення Excel файлу із даними про продукти, користувачів та категорії, які отримуються від API.
## Тестування
Було створено клас StoreFakeJSONMapperTest.
StoreFakeJSONMapperTest має в собі такі тести:
- MapCategories_MinimalValidJSON_ShouldReturnListOfCategories: Перевіряє метод mapCategories для парсингу JSON-рядка категорій.
- MapProducts_MinimalValidJSON_ShouldReturnListOfProducts: Перевіряє метод mapProducts для парсингу JSON-рядка продуктів.
- MapUsers_MinimalValidJSON_ShouldReturnListOfUsers: Перевіряє метод mapUsers для парсингу JSON-рядка користувачів.
## Висновок
Навчився працювати з веб API та створювати Excel-файли.
