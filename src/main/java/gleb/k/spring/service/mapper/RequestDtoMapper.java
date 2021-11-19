package gleb.k.spring.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
