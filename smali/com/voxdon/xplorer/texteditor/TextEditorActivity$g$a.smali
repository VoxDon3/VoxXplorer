.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g$a;
.super Landroid/text/SpannableStringBuilder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;Ljava/lang/CharSequence;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g$a;->q:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public bridge synthetic replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .registers 6

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$g$a;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .registers 8

    if-nez p1, :cond_34

    if-nez p4, :cond_34

    if-ne p2, p5, :cond_34

    .line 2
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-ne p2, v0, :cond_34

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_34

    .line 3
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 4
    instance-of v0, p3, Landroid/text/Spanned;

    if-eqz v0, :cond_34

    .line 5
    move-object v0, p3

    check-cast v0, Landroid/text/Spanned;

    .line 6
    const-class v1, Landroid/text/style/SuggestionSpan;

    invoke-interface {v0, p4, p5, v1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v0

    if-ge v0, p5, :cond_34

    return-object p0

    .line 7
    :cond_34
    invoke-super/range {p0 .. p5}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method
