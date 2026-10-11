.class public final synthetic Lax/w5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/x5/c;


# direct methods
.method public synthetic constructor <init>(Lax/x5/c;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/h;->a:Lax/x5/c;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w5/h;->a:Lax/x5/c;

    invoke-interface {v0}, Lax/x5/c;->c()Lax/s5/a;

    move-result-object v0

    return-object v0
.end method
