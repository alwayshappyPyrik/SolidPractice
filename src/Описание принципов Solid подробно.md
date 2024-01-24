[Класс Main Принцип: Dependency Inversion](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Main.java#L11C8-L16C96) <br />
Принцип заключается в том, что наша логика будет зависеть только от абстракции процессов реализованных в перечисленных интерфейсаx ProductsAble, ProductsFilter, BasketAble, OrderAble, RatingAble, SimpleRecommendationSystemAble. <br />
[Класс Main Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Main.java#L18C8-L62C2) <br />
Принцип заключается в том, что этот класс используется только для ввода действия, которые мы хотим свершить. <br />
[Класс Basket Принцип: Open Closed](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Basket.java#L10) <br />
Принцип заключается в том, если мы хотим добавить, какую-нибудь функциональность, то я добавлю еще один метод в интерфейс и реализую его в классе. <br />
[Класс Basket Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Basket.java#L15C5-L58C6) <br />
Принцип заключается в том, что этот класс используется только для работы с корзиной (для составление продуктовой корзины пользователя). <br />
[Класс Basket Принцип: Magics](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Basket.java#L45) <br />
Принцип заключается в том, что я вызываю метод size() у продуктовой корзины, а не использую числа. <br />
[Класс Order Принцип: Open Closed](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Order.java#L9) <br />
Принцип заключается в том, если мы хотим добавить, какую-нибудь функциональность, то я добавлю еще один метод в интерфейс и реализую его в классе. <br />
[Класс Order Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Order.java#L14C5-L35C6) <br />
Принцип заключается в том, что этот класс используется только для работы с заказами. <br />
[Класс Products Принцип: Interface Segregation](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Products.java#L10) <br />
Принцип заключается в том, что для работы с продуктами, а использую два интерфейса ProductsAble, ProductsFilter разделенные по логическим признакам и реализую их. <br />
[Класс Products Принцип: Open Closed](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Products.java#L10) <br />
Принцип заключается в том, если мы хотим добавить, какую-нибудь функциональность, то я добавлю еще один метод в интерфейс и реализую его в классе. <br />
[Класс Products Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Products.java#L15C4-L45C6) <br />
Принцип заключается в том, что этот класс служит для работы с продуктами. <br />
[Класс Products Принцип: DRY](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Products.java#L16C4-L22C6) <br />
Принцип заключается в том, что метод addProducts() вызывается в filterProductsByName() и filterProductsByPrice(). <br />
[Класс Rating Принцип: Open Closed](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Rating.java#L10) <br />
Принцип заключается в том, если мы хотим добавить, какую-нибудь функциональность, то я добавлю еще один метод в интерфейс и реализую его в классе. <br />
[Класс Rating Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/Rating.java#L15C4-L45C6) <br />
Принцип заключается в том, что этот класс служит только для работы с рейтингом. <br />
[Класс SimpleRecommendationSystem Принцип: Open Closed](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/SimpleRecommendationSystem.java#L8) <br />
Принцип заключается в том, если мы хотим добавить, какую-нибудь функциональность, то я добавлю еще один метод в интерфейс и реализую его в классе. <br />
[Класс SimpleRecommendationSystem Принцип: Single-responsibility](https://github.com/alwayshappyPyrik/SolidPractice/blob/37229e32fa20d457bbf877d89416d306ebcab0d9/src/main/java/org/example/SimpleRecommendationSystem.java#L10C4-L23C6) <br />
Принцип заключается в том, что этот класс служит только для работы с рекомендованной системой. <br />