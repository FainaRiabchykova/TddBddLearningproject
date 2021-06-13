package com.ria.actions;

import com.ria.dataservice.EmailData;
import com.ria.dataservice.EmailProvider;
import com.ria.pages.DraftPage;
import com.ria.pages.GmailPage;
import com.ria.pages.SignInPage;

public class BaseAction {
    SignInPage signInPage = new SignInPage();
    GmailPage gmailPage = new GmailPage();
    protected DraftPage draftPage = new DraftPage();


    protected EmailData emailData = EmailProvider.getEmailData();

    protected final long TIME_TO_WAIT = 30;
    protected final String MAIL_URL_KEYWORD = "mail";
    protected final String DRAFT_PAGE_URL_KEYWORD = "drafts";

}
