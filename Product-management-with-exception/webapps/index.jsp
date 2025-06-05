<html>
    <head>
        <title>
            Product-Management-with-exception
        </title>
    </head>
    <body>
    <form action="product" method="post">
        <div align="center">
            <h1>WELCOME TO THE PRODUCT REGISTRATION FORM</h1><br><br>
            ProductID:<input type="text" placeholder="Enter the ProductId" name="productid"><br><br>
            ProductName:<input type="text" placeholder="Enter the Product Name" name="productname"><br><br>
            Price:<input type="number" placeholder="Enter the Product Price" name="productprice"><br><br>
            Quantity:<input type="number" placeholder="Enter the Quantity" name="quantity"><br><br>
            <label for="category">Category:</label>
            <select name="category">
            <option value="">-- Select Category --</option>
            <option value="Electronics">Electronics</option>
            <option value="Clothing">Clothing</option>
            <option value="Books">Books</option>
            <option value="Home">Home</option>
            </select><br><br>
            <input type="submit" value="Reg" style="color:green">

        </div>
        </form>
    </body>
</html>