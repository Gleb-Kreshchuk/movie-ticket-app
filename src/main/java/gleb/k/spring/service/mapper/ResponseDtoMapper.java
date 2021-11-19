package gleb.k.spring.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
