# e-COMMERCE

### I Wayan Aditya Tustanda Suarken
2205551125

## About
Program ini bertujuan untuk membuat backend API untuk aplikasi e-commerce sederhana yang nantinya memberikan response dengan format JSON. Adapun request method pada API memuat: <br/>
**GET** untuk mendapatkan list atau detail data dari entitas. <br/>
**POST** untuk membuat data entitas baru. <br/>
**PUT** untuk mengubah data dari entitas. <br/>
**DELETE** untuk menghapus data dari entitas. <br/>

Data-data yang digunakan dalam aplikasi e-Commerce ini akan disimpan pada **database SQLite** yang kemudian akan dilakukan suatu pengujian API yang telah diprogram melalui aplikasi **Postman**

## Spesifikasi API dalam Aplikasi e-Commerce
### **GET**

- GET /users untuk mendapatkan daftar semua user yang termuat di dalam database. <br/>
  'masukin code'

![GetUsers](/image/GetAllUser.jpg"GetAllUser")

<br/>

- GET /users/{id} untuk mendapatkan informasi user dan alamatnya. <br/>
  'masukin code'

![GetUserId](/image/GetUserId.jpg"GetUserAdd")

<br/>

- GET /users/{id}/products untuk mendapatkan daftar produk milik user. <br/>
  'masukin code'

![GetUserProduct](/image/GetUserProduct.jpg"GetUserProduct")

<br/>

- GET /users/{id}/orders untuk mendapatkan daftar order milik user. <br/>
  'masukin code'

![GetUserOrders](/image/GetUserOrders.jpg"GetUserOrders")

<br/>

- GET /users/{id}/reviews untuk mendapatkan daftar review yang dibuat oleh user. <br/>
  'masukin code'

```
{
  "User Information": [
    {
      "First_Name": "supri",
      "Type": "Buyer",
      "Email": "adi@gmail.com",
      "Last_Name": "adi",
      "Id": 1,
      "Phone Number": "0851123281"
    },
    {
      "First_Name": "kujisa",
      "Type": "Seller",
      "Email": "amburadul@gmail.com",
      "Last_Name": "amburadul",
      "Id": 2,
      "Phone Number": "0879912323"
    },
    {
      "First_Name": "cesar",
      "Type": "Buyer",
      "Email": "godolo@gmail.com",
      "Last_Name": "godolo",
      "Id": 3,
      "Phone Number": "0897189923"
    },
    {
      "First_Name": "andi",
      "Type": "Seller",
      "Email": "hiya@gmail.com",
      "Last_Name": "nurul",
      "Id": 4,
      "Phone Number": "0812227765"
    },
    {
      "First_Name": "ronaldo",
      "Type": "Buyer",
      "Email": "siuuu@gmail.com",
      "Last_Name": "siu",
      "Id": 5,
      "Phone Number": "0854489321"
    }
  ]
}

```

<br/>

- GET /orders/{id} untuk mendapatkan informasi order, buyer, detail order, review, product title, beserta pricenya. <br/>
  'masukin code'

```agsl
{
  "Orders Information": [
    {
      "isPaid": 0,
      "Discount": 0,
      "Total": 20000,
      "Note": 0,
      "Id": 1
    },
    {
      "isPaid": 0,
      "Discount": 0,
      "Total": 5000,
      "Note": 0,
      "Id": 3
    },
    {
      "isPaid": 0,
      "Discount": 0,
      "Total": 10000,
      "Note": 0,
      "Id": 5
    },
    {
      "isPaid": 0,
      "Discount": 0,
      "Total": 20000,
      "Note": 0,
      "Id": 5
    },
    {
      "isPaid": 0,
      "Discount": 0,
      "Total": 20000,
      "Note": 0,
      "Id": 1
    }
  ]
}

```

<br/>

- GET /products untuk mendapatkan daftar semua produk. <br/>
  'masukin code'

```agsl
{
  "Product Information": [
    {
      "Description": "makanan",
      "User": 2,
      "Price": "10000",
      "Title": "keripik kentang",
      "Id": 2201,
      "Stock": 10
    },
    {
      "Description": "minuman",
      "User": 4,
      "Price": "5000",
      "Title": "nutri sari",
      "Id": 2202,
      "Stock": 10
    },
    {
      "Description": "makanan",
      "User": 4,
      "Price": "10000",
      "Title": "kentang goreng",
      "Id": 2203,
      "Stock": 10
    },
    {
      "Description": "makanan",
      "User": 2,
      "Price": "10000",
      "Title": "sempol",
      "Id": 2204,
      "Stock": 10
    },
    {
      "Description": "makanan",
      "User": 4,
      "Price": "10000",
      "Title": "kaki naga",
      "Id": 2205,
      "Stock": 10
    }
  ]
}

```


<br/>

- GET /products/{id} untuk mendapatkan informasi produk dan seller. <br/>
  'masukin code'

```agsl
{
  "Product Information": [
    {
      "First_Name": "andi",
      "Type": "Seller",
      "Description": "minuman",
      "Email": "hiya@gmail.com",
      "Price": "5000",
      "Last_Name": "nurul",
      "Title": "nutri sari",
      "Seller": 4,
      "Id": 2202,
      "id": 4,
      "Phone Number": "0812227765",
      "Stock": 10
    },
    {
      "First_Name": "andi",
      "Type": "Seller",
      "Description": "makanan",
      "Email": "hiya@gmail.com",
      "Price": "10000",
      "Last_Name": "nurul",
      "Title": "kentang goreng",
      "Seller": 4,
      "Id": 2203,
      "id": 4,
      "Phone Number": "0812227765",
      "Stock": 10
    },
    {
      "First_Name": "andi",
      "Type": "Seller",
      "Description": "makanan",
      "Email": "hiya@gmail.com",
      "Price": "10000",
      "Last_Name": "nurul",
      "Title": "kaki naga",
      "Seller": 4,
      "Id": 2205,
      "id": 4,
      "Phone Number": "0812227765",
      "Stock": 10
    }
  ]
}

```