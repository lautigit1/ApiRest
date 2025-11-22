package com.utn.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductosApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	public org.springframework.boot.CommandLineRunner initData(
			com.utn.productos.repository.ProductoRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(com.utn.productos.model.Producto.builder()
						.nombre("Notebook Gamer")
						.descripcion("Notebook potente para juegos")
						.precio(new java.math.BigDecimal("1500.00"))
						.stock(10)
						.categoria(com.utn.productos.model.Categoria.ELECTRONICA)
						.build());

				repository.save(com.utn.productos.model.Producto.builder()
						.nombre("Camiseta de Fútbol")
						.descripcion("Camiseta oficial de la selección")
						.precio(new java.math.BigDecimal("80.00"))
						.stock(50)
						.categoria(com.utn.productos.model.Categoria.ROPA)
						.build());

				repository.save(com.utn.productos.model.Producto.builder()
						.nombre("Café Tostado")
						.descripcion("Café premium 500g")
						.precio(new java.math.BigDecimal("15.00"))
						.stock(100)
						.categoria(com.utn.productos.model.Categoria.ALIMENTOS)
						.build());
			}
		};
	}
}
