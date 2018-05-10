package website.service.user.editor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import website.entity.User;
import website.service.user.UserService;

import java.beans.PropertyEditorSupport;

@Component
public class UserEditor extends PropertyEditorSupport{
    @Autowired
    private UserService userService;
    @Override
    public void setAsText(String idOfUser) throws IllegalArgumentException{
        User user = userService.findOne(Integer.parseInt(idOfUser));
        setValue(user);
    }

}
