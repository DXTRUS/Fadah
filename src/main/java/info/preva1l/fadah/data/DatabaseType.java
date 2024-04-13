package info.preva1l.fadah.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DatabaseType {
    MONGO("mongodb", "MongoDB"),
    MYSQL("mysql", "MySQL"),
    MARIADB("mariadb", "MariaDB"),
    ;
    private final String id;
    private final String friendly_name;
}