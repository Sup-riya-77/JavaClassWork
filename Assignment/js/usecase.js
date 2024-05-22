document.getElementById("customerForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the form from submitting
    
    // Get form values
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var account = document.getElementById("account").value;

    // Validate email and phone
    var isValidEmail = validateEmail(email);
    var isValidPhone = validatePhoneNumber(phone);
    var isValidName = validatePhoneNumber(name);

    // Display error messages if validation fails
    document.getElementById("emailError").innerText = isValidEmail ? "" : "Enter a valid email";
    document.getElementById("phoneError").innerText = isValidPhone ? "" : "Enter a valid phone number";
    document.getElementById("nameError").innerText = isValidName ? "" : "Enter a valid Name";

    // If both email and phone are valid, proceed
    if (isValidEmail && isValidPhone && isValidName) {
        // Create customer object
        var customer = {
            name: name,
            email: email,
            phone: phone,
            account: account
        };

        // Add customer to table
        addCustomerToTable(customer);

        // Clear form inputs
        document.getElementById("customerForm").reset();
    }
});

function validateEmail(email) {
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}

function validatePhoneNumber(phoneNumber) {
    var re = /^[789]\d{9}$/;
    return re.test(phoneNumber);
}
function validateName(name) {
    // Replace any characters that are not alphabets with an empty string
    input.value = input.value.replace(/[^a-zA-Z]/g, '');
}

function addCustomerToTable(customer) {
    var table = document.getElementById("customerTable").getElementsByTagName('tbody')[0];
    var row = table.insertRow();
    var nameCell = row.insertCell(0);
    var emailCell = row.insertCell(1);
    var phoneCell = row.insertCell(2);
    var accountCell=row.insertCell(3);

    nameCell.innerText = customer.name;
    emailCell.innerText = customer.email;
    phoneCell.innerText = customer.phone;
    accountCell.innerHTML=customer.account;
}