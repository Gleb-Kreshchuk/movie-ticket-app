package gleb.k.spring.service.mapper;

import gleb.k.spring.dto.response.UserResponseDto;
import gleb.k.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoles(user.getRoles());
        return responseDto;
    }
}
