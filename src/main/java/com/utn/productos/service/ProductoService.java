package com.utn.productos.service;

import com.utn.productos.dto.ActualizarStockDTO;
import com.utn.productos.dto.ProductoDTO;
import com.utn.productos.dto.ProductoResponseDTO;
import com.utn.productos.model.Categoria;

import java.util.List;

public interface ProductoService {
    ProductoResponseDTO crearProducto(ProductoDTO productoDTO);

    List<ProductoResponseDTO> listarProductos();

    ProductoResponseDTO buscarPorId(Long id);

    List<ProductoResponseDTO> buscarPorCategoria(Categoria categoria);

    ProductoResponseDTO actualizarProducto(Long id, ProductoDTO productoDTO);

    ProductoResponseDTO actualizarStock(Long id, ActualizarStockDTO stockDTO);

    void eliminarProducto(Long id);
}
