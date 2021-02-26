package ru.sfedu.studyProject.curs;

public class Constants {
    public static final String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss.SSS";

    public static final String CONFIG_PATH = "config.path";
    public static final String CSV_PATH = "csv.path";
    public static final String XML_PATH = "xml.path";
    public static final String CSV_EXTENSION = "csv.extension";
    public static final String XML_EXTENSION = "xml.extension";
    public static final String EXCEPTION_CANNOT_CREATE_FILE = "exception.IOException.cannotCreateFile.message";
    public static final String EXCEPTION_WRONG_DATA = "exception.NPE.wrongData.message";
    public static final String EXCEPTION_NOT_ENOUGH = "exception.NPE.notEnough.message";
    public static final String ARRAY_DELIMITER = "array.delimiter";
    public static final String ARRAY_START_SYMBOL = "array.startSymbol";
    public static final String ARRAY_END_SYMBOL = "array.endSymbol";
    public static final String MAP_START_SYMBOL = "map.startSymbol";
    public static final String MAP_END_SYMBOL = "map.endSymbol";
    public static final String MAP_DELIMITER = "map.delimiter";
    public static final String TEST_USER_INCORRECT_EMAIL = "test.user.incorrect.email";
    public static final String TEST_USER_INCORRECT_PASSWORD = "test.user.incorrect.password";
    public static final String CONVERTER_REGEXP_LIST_WITHOUT_QUOTES = "converter.regexp.list.withoutQuotes";
    public static final String CONVERTER_REGEXP_MAP_WITHOUT_QUOTES = "converter.regexp.map.withoutQuotes";
    public static final String CONVERTER_REGEXP_LIST_WITH_QUOTES = "converter.regexp.list.withQuotes";
    public static final String CONVERTER_REGEXP_MAP_WITH_QUOTES = "converter.regexp.map.withQuotes";
    public static final String FIELD_NAME_TASK = "field.name.task";
    public static final String FIELD_NAME_NAME = "field.name.name";
    public static final String FIELD_NAME_STATUS = "field.name.status";
    public static final String FIELD_NAME_DESCRIPTION = "field.name.description";
    public static final String FIELD_NAME_IMPORTANCE = "field.name.importance";
    public static final String FIELD_NAME_REMIND_TYPE = "field.name.remindType";
    public static final String FIELD_NAME_REPETITION_TYPE = "field.name.repetitionType";
    public static final String FIELD_NAME_TIME = "field.name.time";
    public static final String FIELD_NAME_SURNAME = "field.name.surname";
    public static final String FIELD_NAME_EMAIL = "field.name.email";
    public static final String FIELD_NAME_PASSWORD = "field.name.password";
    public static final String FIELD_NAME_MEMBER = "field.name.member";
    public static final String FIELD_NAME_GROUP_TYPE = "field.name.groupType";
    public static final String FIELD_NAME_GROUP_TYPE_SQL = "field.name.group_type.sql";
    public static final String MAP_FORMAT_STRING = "map.formatString";
    public static final String FORMAT_USER_TO_STRING = "format.user.toString";
    public static final String FORMAT_MODIFICATION_RECORD_TO_STRING = "format.modificationRecord.toString";
    public static final String FORMAT_EXTENDED_TASK_TO_STRING = "format.extendedTask.toString";
    public static final String FORMAT_BASIC_TASK_TO_STRING = "format.basicTask.toString";
    public static final String FORMAT_GROUP_TO_STRING = "format.group.toString";
    public static final String FORMAT_GROUP_TASK_TO_STRING = "format.groupTask.toString";
    public static final String FORMAT_GROUP_STATISTIC = "format.groupStatistic";
    public static final String FORMAT_TASK_STATISTIC = "format.taskStatistic";
    public static final String NEW_LINE = "new_line";
    public static final String TAB = "tab";
    public static final String QUOTES = "quotes";
    public static final String SINGLE_QUOTES = "single_quotes";
    public static final String NULL = "text.null";
    public static final String MESSAGE_USER_NOT_FOUNDED = "message.userNotFounded";
    public static final String FORMAT_USER = "format.user";
    public static final String JDBC_DRIVER = "jdbc.driver";
    public static final String JDBC_URL = "jdbc.url";

    public static final String SQL_CREATE_TABLE_USER = "sql.create.table.user";
    public static final String SQL_CREATE_TABLE_GROUP = "sql.create.table.group";
    public static final String SQL_CREATE_TABLE_GROUP_MEMBERSHIP = "sql.create.table.group_membership";
    public static final String SQL_CREATE_TABLE_TASK = "sql.create.table.task";
    public static final String SQL_CREATE_TABLE_MODIFICATION_RECORD = "sql.create.table.modification_record";
    public static final String SQL_CREATE_TABLE_USER_HISTORY = "sql.create.table.user_history";
    public static final String SQL_CREATE_TABLE_GROUP_HISTORY = "sql.create.table.group_history";
    public static final String SQL_CREATE_TABLE_TASK_HISTORY = "sql.create.table.task_history";
    public static final String SQL_CREATE_TABLE_USERS_TASKS = "sql.create.table.users_tasks";
    public static final String SQL_CREATE_TABLE_GROUP_TASKS = "sql.create.table.group_tasks";
    public static final String SQL_SELECT_BY_ID = "sql.select.by_id";
    public static final String SQL_SELECT = "sql.select";
    public static final String SQL_SELECT_BY_EMAIL_PASSWORD = "sql.select.by_email_password";
    public static final String SQL_DROP_TABLE_USER = "sql.drop.table.user";
    public static final String SQL_DROP_TABLE_GROUP = "sql.drop.table.group";
    public static final String SQL_DROP_TABLE_GROUP_MEMBERSHIP = "sql.drop.table.group_membership";
    public static final String SQL_DROP_TABLE_TASK = "sql.drop.table.task";
    public static final String SQL_DROP_TABLE_MODIFICATION_RECORD = "sql.drop.table.modification_record";
    public static final String SQL_DROP_TABLE_USER_HISTORY = "sql.drop.table.user_history";
    public static final String SQL_DROP_TABLE_GROUP_HISTORY = "sql.drop.table.group_history";
    public static final String SQL_DROP_TABLE_TASK_HISTORY = "sql.drop.table.task_history";
    public static final String SQL_DROP_TABLE_USERS_TASKS = "sql.drop.table.users_tasks";
    public static final String SQL_DROP_TABLE_GROUP_TASKS = "sql.drop.table.group_tasks";
    public static final String FIELD_NAME_ID = "field.name.id";
    public static final String FIELD_NAME_CREATED = "field.name.created";
    public static final String FIELD_NAME_TOKEN = "field.name.token";
    public static final String FIELD_NAME_SIGN_UP_TYPE = "field.name.sign_up_type";
    public static final String SQL_SELECT_MEMBER_LIST = "sql.select.member_list";
    public static final String SQL_UPDATE_USER = "sql.update.user";
    public static final String SQL_UPDATE_GROUP = "sql.update.group";
    public static final String SQL_UPDATE_TASK = "sql.update.task";
    public static final String SQL_INSERT_USER = "sql.insert.user";
    public static final String SQL_INSERT_GROUP = "sql.insert.group";
    public static final String SQL_INSERT_TASK = "sql.insert.task";
    public static final String SQL_INSERT_USER_TASK = "sql.insert.user_tasks";
    public static final String SQL_INSERT_GROUP_MEMBERSHIP = "sql.insert.group_membership";
    public static final String SQL_INSERT_GROUP_TASK = "sql.insert.group_task";
    public static final String SQL_INSERT_USER_HISTORY = "sql.insert.user_history";
    public static final String SQL_INSERT_TASK_HISTORY = "sql.insert.task_history";
    public static final String SQL_INSERT_GROUP_HISTORY = "sql.insert.group_history";
    public static final String SQL_SELECT_GROUP_BY_USER = "sql.select.group_by_user";
    public static final String SQL_SELECT_GROUP_BY_NAME = "sql.select.group_by_name";
    public static final String SQL_DELETE_GROUP = "sql.delete.group";
    public static final String FIELD_NAME_TASK_TYPE = "field.name.task_type";
    public static final String FIELD_NAME_REPETITION_TYPE_SQL = "field.name.repetition_type.sql";
    public static final String FIELD_NAME_REMIND_TYPE_SQL = "field.name.remind_type.sql";
    public static final String SQL_SELECT_USERS_TASK_LIST = "sql.select.users_task_list";
    public static final String SQL_SELECT_GROUP_TASK_LIST = "sql.select.group_task_list";
    public static final String SQL_SELECT_MAX_ID = "sql.select.max_id";
    public static final String SQL_PARSE_DATE_TIME = "sql.parseDateTime";
    public static final String FIELD_TASK_STATE = "field.task_state";
    public static final String FIELD_USER_ROLE = "field.user_role";
    public static final String FIELD_MAX_ID = "field.max_id";
    public static final String SQL_DELETE_TASK = "sql.delete.task";
    public static final String SQL_SELECT_MODIFICATION_RECORD_USER = "sql.select.modification_record.user";
    public static final String SQL_SELECT_MODIFICATION_RECORD_TASK = "sql.select.modification_record.task";
    public static final String SQL_SELECT_MODIFICATION_RECORD_GROUP = "sql.select.modification_record.group";
    public static final String SQL_INSERT_MODIFICATION_RECORD = "sql.insert.modification_record";
    public static final String FIELD_NAME_CHANGED_DATE = "field.changed_date";
    public static final String FIELD_NAME_CHANGED_VALUE = "field.changed_value";
    public static final String FIELD_NAME_OPERATION_TYPE = "field.operation_type";
    public static final String SQL_BEAN_NAME_MODIFICATION_RECORD = "sql.bean.name.modification_record";
    public static final String DATA_PROVIDER_CSV = "DataProviderCsv";
    public static final String DATA_PROVIDER_XML = "DataProviderXml";
    public static final String DATA_PROVIDER_JDBC = "DataProviderJdbc";
    public static final String GET_TASK_STATISTIC = "getTaskStatistic";
    public static final String GET_GROUP_STATISTIC = "getGroupStatistic";
    public static final String GET_USER_INFO = "getUserInfo";
    public static final String START_STR = "start.format";
    public static final String END_STR = "end.format";
    public static final String WITH_ARGUMENTS = "with_arguments";
    public static final String TEST = "test";
    public static final String AT = "@";
}