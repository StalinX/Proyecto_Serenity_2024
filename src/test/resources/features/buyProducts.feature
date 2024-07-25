@buyProducts
Feature: Test Shopping Cart

  Scenario: Adds 2 products
    Given Stalin navegar a la pagina principal
    When buscar "Samsung SyncMaster"
    And añadir al carrito
    When buscar "MacBook"
    And añadir al carrito
    When Dar click en shoppind cart
    And verificar
    When Seleccionar guest checkout
    When llenar formulario "Stalin", "Riofrio", "sprt.prof@gmail.com", "0993485568", "Loja", "Loja", "010101", "Ecuador", "Loja"
    When Dar click boton continue
    When aceptar condiciones
    When confirmar compra
    Then Validar mensaje "Your order has been placed!"